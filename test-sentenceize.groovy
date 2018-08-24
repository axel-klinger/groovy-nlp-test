@Grab(group='org.apache.opennlp', module='opennlp-tools', version='1.8.4')
// @Grab(group='org.apache.lucene', module='lucene-core', version='7.3.1')

import opennlp.tools.sentdetect.*

File sentModelFile = new File("opennlp/de-sent.bin")
InputStream sentModelStream = new FileInputStream(sentModelFile)
SentenceModel model = new SentenceModel(sentModelStream)
SentenceDetector detector = new SentenceDetectorME(model)

String text = new File('graph-de.md').text
String[] result = detector.sentDetect(text)
result.each { r ->
  println "Sentence: " + r
}
