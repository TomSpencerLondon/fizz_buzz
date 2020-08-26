(ns fizz-buzz.core-test
  (:require [clojure.test :refer :all]
            [fizz-buzz.core :refer :all]))

(deftest fizz-buzz-printer-test
  (testing "with 1"
    (is (= "1\n" (fizz-buzz-printer 1)))))