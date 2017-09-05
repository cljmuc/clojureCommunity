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

(deftest test-groceries-discount
  (testing
    (let [input (list "orangejuice","orangejuice", "choclate", "coffee", "coffee", "coffee")
          solution 13.95]
      (is (= solution (solve-discount input))))))

(deftest test-groceries-discount2
  (testing
    (let [input (list "orangejuice","orangejuice", "eggs", "eggs")
          solution 7.00]
      (is (= solution (solve-discount input))))))

(deftest test-groceries-special-offer
  (testing
    (let [input (list "orangejuice","orangejuice", "choclate", "coffee", "coffee", "coffee")
          solution 10.80]
      (is (= solution (solve-special-offer input))))))

(deftest test-groceries-special-offer2
  (testing
    (let [input (list  "eggs", "eggs","orangejuice","orangejuice", "orangejuice","orangejuice", "choclate", "choclate", "choclate")
          solution 11.05]
      (is (= solution (solve-special-offer input))))))
