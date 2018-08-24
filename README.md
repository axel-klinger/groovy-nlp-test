# Examples for Natural Language Processing with Groovy

Used Tools and Frameworks
* OpenNLP
* Stanford CoreNLP

## Devide text into sentences

```
groovy test-sentenceize.groovy
```

```
Sentence: Ein Graph ist ein Gebilde aus Knoten und Kanten.
Sentence: Ein Graph (selten auch Graf[1]) ist in der Graphentheorie eine abstrakte Struktur, die eine Menge von Objekten zusammen mit den zwischen diesen Objekten bestehenden Verbindungen repr▒sentiert.
Sentence: Die mathematischen Abstraktionen der Objekte werden dabei Knoten (auch Ecken) des Graphen genannt.
Sentence: Die paarweisen Verbindungen zwischen Knoten hei▒en Kanten (manchmal auch B▒gen).
Sentence: Die Kanten k▒nnen gerichtet oder ungerichtet sein.
Sentence: H▒ufig werden Graphen anschaulich gezeichnet, indem die Knoten durch Punkte und die Kanten durch Linien dargestellt werden[2].
Sentence: Anschauliche Beispiele f▒r Graphen sind ein Stammbaum oder das U-Bahn-Netz einer Stadt (siehe Abbildungen).
Sentence: Bei einem Stammbaum stellt jeder Knoten ein Familienmitglied dar und jede Kante ist eine Verbindung zwischen einem Elternteil und einem Kind.
Sentence: In einem U-Bahn-Netz stellt jeder Knoten eine U-Bahn-Station dar und jede Kante eine direkte Zugverbindung zwischen zwei Stationen.
```

## Devide sentences into token

```
groovy test-tokenize.groovy
```

```
Sentence split by whitespace
A | mixed | graph | is | a | graph | is | written | as | an | ordered | triple | G | = | (V, | E, | A) | with | V, | E, | and | A | defined | as | above.
Sentence split by OpenNLP SimpleTokenizer
A | mixed | graph | is | a | graph | is | written | as | an | ordered | triple | G | = | ( | V | , | E | , | A | ) | with | V | , | E | , | and | A | defined | as | above | .
```

## Part-Of-Speach tagging

```
groovy test-pos-tagging.groovy
```

```
Input: In graph theory, a graph is an abstract structure that represents a set of objects together with the connections between these objects.
Result: In/IN graph/NN theory/NN ,/, a/DT graph/NN is/VBZ an/DT abstract/JJ structure/NN that/WDT represents/VBZ a/DT set/NN of/IN objects/NNS together/RB with/IN the/DT connections/NNS between/IN these/DT objects/NNS ./.
```

## Parse a sentence - create parse tree

```
groovy test-en-parser.groovy
```

```
Input: In graph theory, a graph is an abstract structure that represents a set of objects together with the connections between these objects.
Result 0: (TOP (S (PP (IN In) (NP (NN graph))) (, theory,) (NP (DT a) (NN graph)) (VP (VBZ is) (NP (NP (NP (DT an) (JJ abstract) (NN structure)) (SBAR (WHNP (WDT that)) (S (VP (VBZ represents) (NP (NP (DT a) (NN set)) (PP (IN of) (NP (NNS objects)))))))) (PP (S (SBAR (ADVP (RB together) (PP (IN with) (NP (NP (DT the) (NNS connections)) (PP (IN between) (NP (DT these) (FW objects.)))))))))))))
Result 1: (TOP (S (PP (IN In) (NP (NN graph))) (, theory,) (NP (DT a) (NN graph)) (VP (VBZ is) (NP (NP (NP (DT an) (JJ abstract) (NN structure)) (SBAR (WHNP (WDT that)) (S (VP (VBZ represents) (NP (NP (DT a) (NN set)) (PP (IN of) (NP (NNS objects)))))))) (PP (S (SBAR (ADVP (RB together) (PP (IN with) (NP (NP (DT the) (NNS connections)) (PP (IN between) (NP (DT these) (FW objects.)))))))))))))
Result 2: (TOP (S (PP (IN In) (NP (NN graph))) (, theory,) (NP (DT a) (NN graph)) (VP (VBZ is) (NP (NP (NP (DT an) (JJ abstract) (NN structure)) (SBAR (WHNP (WDT that)) (S (VP (VBZ represents) (NP (NP (DT a) (NN set)) (PP (IN of) (NP (NNS objects)))))))) (SBAR (S (SBAR (ADVP (RB together) (PP (IN with) (NP (NP (DT the) (NNS connections)) (PP (IN between) (NP (DT these) (FW objects.)))))))))))))
```

## Stanford Parser-Test

Load JARs from https://stanfordnlp.github.io/CoreNLP/

```
 groovy -cp "stanford/stanford-corenlp-3.9.1.jar;stanford/stanford-corenlp-3.9.1-models.jar;stanford/stanford-german-corenlp-2018-02-27-models.jar" test-stanford-parser-de.groovy
```
