; p002.clj
;
; Project Euler
; Problem 2
; Add all even numbers < 4,000,000 in the Fibonacci sequence
;
; Copyright (c) 2012 Dustin Barker

(ns net.dstnbrkr.euler.p002)

(defn fibonacci
  ([] (fibonacci 1 1))
  ([m n] (cons m (lazy-seq (fibonacci n (+ m n))))))

(defn sum-list [list limit]
  (defn add [currlist sum]
    (let [n (first currlist)]
      (if (> n limit)
          sum
          (add (rest currlist) (+ n sum)))))
  (add list 0))

(defn p002 []
  (sum-list (filter even? (fibonacci)) 4000000))
