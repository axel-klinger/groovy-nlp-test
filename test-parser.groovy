@Grab(group='org.apache.opennlp', module='opennlp-tools', version='1.8.4')

import opennlp.tools.sentdetect.*
import opennlp.tools.tokenize.*


String text = new File('graph-de.md').text
def sentences = sentenceize(text)
sentences.each { s ->
  println s.split("\\s+").join(' | ')
  println tokenize(s).join(' | ')
}



def sentenceize(text) {
  File sentModelFile = new File("opennlp/de-sent.bin")
  InputStream sentModelStream = new FileInputStream(sentModelFile)
  SentenceModel model = new SentenceModel(sentModelStream)
  SentenceDetector detector = new SentenceDetectorME(model)
  return detector.sentDetect(text)
}

def tokenize(sentence) {
  return SimpleTokenizer.INSTANCE.tokenize(sentence)
}
