

(defn proper-divisor? [m n]
  (and (> n 1) (< n m) (zero? (mod m n))))

(defn proper-divisors [n]
  (filter
    (partial proper-divisor? n)
    (range (Math/floor (Math/sqrt n)) 1 -1)))

(defn prime? [n]
  (empty? (proper-divisors n)))

(defn prime-factors [n]
  (filter prime? (proper-divisors n)))


