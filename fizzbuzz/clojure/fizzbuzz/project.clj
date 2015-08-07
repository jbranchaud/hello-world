(defproject fizzbuzz "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot fizzbuzz.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
