(ns numeri-monaci.core-test
  (:require [clojure.test :refer :all]
            [clojure.test.check.clojure-test :refer [defspec]]
            [clojure.test.check.generators :as gen]
            [clojure.test.check.properties :as prop]
            [numeri-monaci.core :refer :all]))

(deftest encode-test
  (are [number numeral] (= (encode number) numeral)
       1    [:i]
       ;; 450  [:c :d :l]
       ;; 1987 [:m :c :m :l :x :x :x :v :i :i]
       ;; 2009 [:m :m :i :x]
       ))

(defspec encode-for-all-positive-numbers
  (prop/for-all [number (gen/choose 1 10)]
    (let [numeral (encode number)]
      (and (seq numeral)
           (every? #{:x :v :i} numeral)))))
