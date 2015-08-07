(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest fizzbuzz-val-test
  (testing "Returns fizz for multiple of 3"
    (is (= "fizz" (fizzbuzz-val 9))))
  (testing "Returns buzz for multiple of 5"
    (is (= "buzz" (fizzbuzz-val 10))))
  (testing "Returns fizzbuzz for multiple of 15"
    (is (= "fizzbuzz" (fizzbuzz-val 15))))
  (testing "Returns stringified number for other values")
    (is (= "13" (fizzbuzz-val 13))))

(deftest generic-fizzbuzz-test
  (testing "Returns vector of fizzbuzz results"
    (is (= ["1" "2" "fizz" "4" "buzz" "fizz" "7" "8" "fizz"]
           (generic-fizzbuzz 9)))))

(deftest fizzbuzz-test
  (testing "Returns vector of 100 fizzbuzz results"
    (is (= 100 (count (fizzbuzz))))))
