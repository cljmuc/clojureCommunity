(ns groceries.test
  (:require [clojure.test :refer :all]
            [groceries.core :refer :all]))


(deftest test-groceries
  (testing
    (let [input (list "orangejuice","orangejuice", "choclate", "coffee", "coffee", "coffee")
          solution 14.50]
      (is (= solution (solve input))))))

(deftest test-groceries2
  (testing
    (let [input (list "orangejuice","orangejuice", "choclate", "choclate")
          solution 7.00]
      (is (= solution (solve input))))))

