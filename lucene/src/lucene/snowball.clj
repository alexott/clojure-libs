(ns lucene.snowball

  (:import org.apache.lucene.analysis.snowball.SnowballAnalyzer
           (org.apache.lucene.analysis StopAnalyzer TokenStream)
           org.apache.lucene.analysis.ru.RussianAnalyzer
           org.apache.lucene.util.Version
           ))

;; public void testLUCENE1678BWComp() throws Exception {
;; Analyzer a = new SnowballSubclassAnalyzer("English");
;; assertAnalyzesToReuse(a, "he abhorred accents",
;; new String[]{"he", "abhorred", "accents"});
;; }
;; SnowballAnalyzer("English", StopAnalyzer.ENGLISH_STOP_WORDS),

