; p002.clj
;
; Project Euler
; Problem 3
; Find the largest prime factor of 600851475143
;
; Copyright (c) 2012 Dustin Barker

(ns net.dstnbrkr.euler.p003)

(defn proper-divisor? [m n]
  (and (> n 1) (< n m) (zero? (mod m n))))

(defn proper-divisors [n]
  (filter
    (partial proper-divisor? n)
    (range (Math/floor (Math/sqrt n)) 2 -1)))

(defn prime? [n]
  (empty? (proper-divisors n)))

(defn largest-prime-factor [n]
  (first (filter prime? (proper-divisors n))))

(defn p003 []
  (largest-prime-factor 600851475143))
