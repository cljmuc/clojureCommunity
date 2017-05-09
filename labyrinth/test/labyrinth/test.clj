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