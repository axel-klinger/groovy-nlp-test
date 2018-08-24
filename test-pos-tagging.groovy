@Grab(group='org.apache.opennlp', module='opennlp-tools', version='1.8.4')

// download models from http://opennlp.sourceforge.net/models-1.5/

import opennlp.tools.tokenize.*
import opennlp.tools.postag.*

File posModelFile = new File("opennlp/en-pos-maxent.bin")
FileInputStream posModelStream = new FileInputStream(posModelFile)
POSModel model = new POSModel(posModelStream)
POSTaggerME tagger = new POSTaggerME(model)

String input = "In graph theory, a graph is an abstract structure that represents a set of objects together with the connections between these objects."
String[] words = SimpleTokenizer.INSTANCE.tokenize(input)
String[] result = tagger.tag(words)

println "Input: " + input
print "Result: "
for(int i=0; i<words.length; i++) {
  print words[i] + "/" + result[i] + " "
}
