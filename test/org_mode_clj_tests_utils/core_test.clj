(ns org-mode-clj-tests-utils.core-test
  (:require [clojure.test :refer :all]
            [org-mode-clj-tests-utils.core :refer :all]))

(deftest test--succeed-1
  (testing
      (is (= 2 2))))

(deftest test--succeed-2
  (testing
      (is (= 3 3))))

(deftest test-no-test-specified
  (testing
      (is (= "All tests succeeded.\n" (with-out-str (tests))))))

(deftest test-some-test-specified
  (testing
      (is (= "All tests succeeded.\n" (with-out-str (tests test--succeed-1))))))

(deftest test-one-test-succeed
  (testing
      (is (= "All tests succeeded.\n" (with-out-str (tests test--succeed-1))))))

(deftest test-two-tests-succeed
  (testing
      (is (= "All tests succeeded.\n" (with-out-str (tests test--succeed-1 
                                                           test--succeed-2))))))
