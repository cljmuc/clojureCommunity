(ns labyrinth.solution_test
  (:require [clojure.test :refer :all]
            [labyrinth.solution :refer :all]))

(deftest test-3-3-labyrinth
  (testing
    (let [labyrinth [[1 :_ :W]
                     [:W :_ :W]
                     [:W :_ :Exit]]
          solution [[1 1 :W]
                    [:W 1 :W]
                    [:W 1 1]]]
      (is (= solution (solve labyrinth))))))

(deftest test-4-4-labyrinth
  (testing
   (let [labyrinth [[1 :_ :_ :W]
                    [:W :W :_ :W]
                    [:W :W :_ :W]
                    [:W :W :_ :Exit]]
         solution [[1 1 1 :W]
                   [:W :W 1 :W]
                   [:W :W 1 :W]
                   [:W :W 1 1]]]
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
   (let [labyrinth [[:_ :_ 1 :W]
                    [:W :W :_ :_]
                    [:W :_ :_ :W]
                    [:W :W :_ :Exit]]
         solution  [[:_ :_ 1 :W]
                    [:W :W 1 :_]
                    [:W :_ 1 :W]
                    [:W :W 1 1]]]
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
