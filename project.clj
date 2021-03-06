(defproject org-mode-clj-tests-utils "0.1.0"
  :description "Clojure code tests utilities for Org-mode"
  :url "https://github.com/structureddynamics/org-mode-clj-tests-utils"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [codox "0.9.4"]]
  :target-path "target/%s"
  :profiles {:dev {:warn-on-reflection true}
             :uberjar {:aot :all}}
  :plugins [[lein-codox "0.9.2"]]
  :codox {:namespaces [cognonto-owl.core]
          :metadata {:doc/format :markdown}
          :output-path "codox"})
