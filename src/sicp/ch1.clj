(ns sicp.ch1)

; Exercise 1.2 
(defn ex12
  []
  (/ (+ 5
        4
        (- 2
           (- 3
              (+ 6 4/5))))
     (* 3
        (- 6 2)
        (- 2 7))))

; Exercise 1.3
; Define a procedure that takes three numbers as arguments and returns
; the sum of the squares of the two larger numbers.

(defn- pow2
  [x]
  (* x x))

(defn- sum-of-squares
  [x y]
  (+ (pow2 x)
     (pow2 y)))

(defn ex13
  [x y z]
  (if (>= x y)
    (if (>= y z)
      (sum-of-squares x y)
      (sum-of-squares x z))
    (if (>= x z)
      (sum-of-squares y x)
      (sum-of-squares y z))))




(defn- fast-expt-iter
  [b n]
  (loop [n n
         b b
         a 1]
    (cond
     (zero? n) a
     (even? n) (recur (/ n 2) (* b b) a)
     :else (recur (dec n) b (* a b)))))
