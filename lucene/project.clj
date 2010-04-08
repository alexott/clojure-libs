(defproject clj-lucene "0.0.1-SNAPSHOT"
  :description "Interface to Lucene"
  :dependencies [[org.clojure/clojure "1.1.0"]
                 [org.clojure/clojure-contrib "1.1.0"]
                 [org.apache.lucene/lucene-core "3.0.1"]
                 ]
  :dev-dependencies [[leiningen/lein-swank "1.2.0-SNAPSHOT"]]
  :repositories {"apache-releases" "http://repository.apache.org/content/repositories/releases/"
;                 "clojure-snapshots" "http://build.clojure.org/snapshots/"
                 }
  )
