; p005.clj
;
; Project Euler
; Problem 5
; Find the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
;
; Copyright (c) 2012 Dustin Barker

(defn proper-divisor? [m n]
  (and (< n m) (zero? (mod m n))))

(defn partial-factors [n]
  (let [max (Math/floor (Math/sqrt n))]
    (filter (partial proper-divisor? n) (range 2 (inc max)))))

(defn proper-divisors [n]
    (sort
      (flatten
        (map #(list %1 (/ n %1))
              (partial-factors n)))))

(defn prime? [n]
  (and (not (= n 1)) (zero? (count (proper-divisors n)))))

(defn prime-factors [n]
  (if (prime? n)
      n
      (map prime-factors (proper-divisors n))))

(number? 12)

; 10: ((2 1) (5 1))
; 12: ((2 2) (3 1))

; partition by first element in pair
; choose pair from each partition with largest second element

; 10: 1,2,5,10 -> 2,5
; 12: 1,2,3,4,6,12 -> 2,3,4,6 -> (2 1),(3 1),((2 2)),((2 1),(3 1)) -> (2 2), (3, 1)
 





