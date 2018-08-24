@Grab(group='org.apache.opennlp', module='opennlp-tools', version='1.8.4')

import opennlp.tools.parser.chunking.*
import opennlp.tools.parser.*
import opennlp.tools.cmdline.parser.*

File parserFile = new File("opennlp/en-parser-chunking.bin")
InputStream parserStream = new FileInputStream(parserFile)
ParserModel model = new ParserModel(parserStream)
Parser parser = ParserFactory.create(model, 20, 0.95)

String input = "In graph theory, a graph is an abstract structure that represents a set of objects together with the connections between these objects."
Parse[] results = ParserTool.parseLine(input , parser, 3)

println "Input: " + input
results.eachWithIndex { r, i ->
  print "Result " + i + ": "
  r.show()
}
