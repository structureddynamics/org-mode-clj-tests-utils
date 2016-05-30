(ns org-mode-clj-tests-utils.core)

(defmacro tests
  "Run one or multiple tests with fixtures. Returns successes or failures. Tests should be in the same namespace."
  [& args]  
  `(binding [clojure.test/*test-out* (java.io.StringWriter.)]
     (clojure.test/test-vars [~@(mapv (fn [tname]
                                        `(var ~tname))
                                      args)])
     (if (empty? (str clojure.test/*test-out*))
       (println "All tests succeeded.")
       (println (str clojure.test/*test-out*)))))
