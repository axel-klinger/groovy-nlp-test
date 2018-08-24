@Grab(group='org.apache.opennlp', module='opennlp-tools', version='1.8.4')
// @Grab(group='org.apache.lucene', module='lucene-core', version='7.3.1')

import opennlp.tools.tokenize.*

String input = "A mixed graph is a graph is written as an ordered triple G = (V, E, A) with V, E, and A defined as above."
String[] result

println "Sentence split by whitespace"
result = input.split("\\s+")
println result.join(" | ")

// println "Sentence split by Solr StandardTokenizer"
// println "Sentence split by OpenNLP english.Tokenizer"

println "Sentence split by OpenNLP SimpleTokenizer"
result = SimpleTokenizer.INSTANCE.tokenize(input)
println result.join(" | ")
