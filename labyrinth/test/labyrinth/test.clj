(ns labyrinth.test
  (:require [clojure.test :refer :all]
            [labyrinth.solution :refer :all]))

(deftest test-exit-labyrinth
  (testing
    (let [labyrinth [[1 :W :_ :_]
                     [:_ :W :W :_]
                     [:_ :_ :_ :Exit]]
          solution [[1 :W :_ :_]
                    [1 :W :W :_]
                    [1 1 1 1]]]
      (is (= solution (solve labyrinth))))))

(deftest test-exit-labyrinth2
  (testing
   (let [labyrinth [[1 :W :_ :W]
                    [:_ :W :_ :W]
                    [:_ :W :W :W]
                    [:_ :_ :_ :Exit]]
         solution [[1 :W :_ :W]
                   [1 :W :_ :W]
                   [1 :W :W :W]
                   [1 1 1 1]]]
    (is (= solution (solve labyrinth))))))

(deftest test-starting-point
  (testing
   (let [labyrinth [[:W :W 1 :W]
                    [:W :W :_ :W]
                    [:W :W :_ :W]
                    [:W :W :_ :Exit]]
         solution [[:W :W 1 :W]
                   [:W :W 1 :W]
                   [:W :W 1 :W]
                   [:W :W 1 1]]]
    (is (= solution (solve labyrinth))))))

(deftest test-no-starting-point
  (testing
   (let [labyrinth [[:_ :_ :W :W]
                    [:W :W :_ :_]
                    [:W :_ :_ :W]
                    [:W :W :_ :Exit]]
         solution  [[:_ :_ :W :W]
                    [:W :W :_ :_]
                    [:W :_ :_ :W]
                    [:W :W :_ :Exit]]]
    (is (= solution (solve labyrinth))))))

(deftest test-no-solution 
  (testing
   (let [labyrinth [[:W :_ :W :W]
                    [:W 1 :_ :_]
                    [:W :_ :_ :W]
                    [:W :W :W :Exit]]
         solution  ["unable to exit"]]
    (is (= solution (solve labyrinth))))))

(deftest test-optimal-solution 
  (testing
   (let [labyrinth [[:_ :_ :_ :_ :_]
                    [:_ :_ :_ :_ :_]
                    [:_ :_ 1 :_ :Exit]
                    [:_ :_ :_ :_ :_]]
         solution [[:_ :_ :_ :_ :_]
                   [:_ :_ :_ :_ :_]
                   [:_ :_ 1 1 1]
                   [:_ :_ :_ :_ :_]]]
     (is (= solution (solve labyrinth))))))