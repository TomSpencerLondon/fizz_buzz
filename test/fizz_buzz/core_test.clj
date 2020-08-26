(ns fizz-buzz.core-test
  (:require [clojure.test :refer :all]
            [fizz-buzz.core :refer :all]))

(deftest fizz-buzz-printer-test
  (testing "with 1"
    (is (= "1\n" (fizz-buzz-printer 1))))
  (testing "with 2"
    (is (= "1\n2\n" (fizz-buzz-printer 2))))
  (testing "from 1 - 3"
    (is (= "1\n2\nFizz\n" (fizz-buzz-printer 3))))
  (testing "from 1 - 4"
    (is (= "1\n2\nFizz\n4\n" (fizz-buzz-printer 4))))
  (testing "from 3 - 4"
    (is (= "Fizz\n4\n" (fizz-buzz-printer 3 4))))
  (testing "from 4 - 5"
    (is (= "4\nBuzz\n" (fizz-buzz-printer 4 5))))
  (testing "from 4 - 6"
    (is (= "4\nBuzz\nFizz\n" (fizz-buzz-printer 4 6))))
  (testing "from 9 - 11"
    (is (= "Fizz\nBuzz\n11\n" (fizz-buzz-printer 9 11))))
  (testing "from 14 - 16"
    (is (= "14\nFizzBuzz\n16\n" (fizz-buzz-printer 14 16))))
  )