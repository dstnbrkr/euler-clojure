; p004.clj
;
; Project Euler
; Problem 4
; Find the largest palindrome made from the product of two 3-digit numbers
;
; Copyright (c) 2012 Dustin Barker

(ns net.dstnbrkr.euler.p004)

(require '[clojure.string :as s])

(defn cartesian-product [r] ; r * r
  (flatten (map (fn [x] (map (fn [y] (* x y)) (range x (dec (last r))))) r)))

(defn palindrome? [n]
  (let [s (str n)]
    (= s (s/reverse s))))

(defn p004 []
  (reduce max (filter palindrome? (cartesian-product (range 100 1000)))))




  


