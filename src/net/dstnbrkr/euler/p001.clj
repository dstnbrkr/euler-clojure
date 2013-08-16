; p001.clj
;
; Project Euler
; Problem 1
; Find the sum of all natural numbers below 1000 that are multiples of 3 or 5
;
; Copyright (c) 2012 Dustin Barker

; Return all multiples of n up to limit
(ns net.dstnbrkr.euler.p001)

(defn sum-multiples [n limit]
  (defn add [m sum]
    (if (>= m limit)
        sum
        (add (+ m n) (+ m sum))))
  (add n 0))

(defn p001 []
  (- (+ (sum-multiples 3 1000) (sum-multiples 5 1000))
     (sum-multiples (* 3 5) 1000)))




