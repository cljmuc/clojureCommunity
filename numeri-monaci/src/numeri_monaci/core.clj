(ns numeri-monaci.core)

(defn encode
  [number]
  [:i])

(defn decode
  [numeral]
  (count numeral))
