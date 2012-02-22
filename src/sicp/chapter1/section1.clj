(ns sicp.chapter1.section1)

;; Exercise 1.2 
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

;; Exercise 1.3
;; Define a procedure that takes three numbers as arguments and returns
;; the sum of the squares of the two larger numbers.

(defn- pow2
  [x]
  (* x x))

(defn- sum-of-squares
  [x y]
  (+ (pow2 x)
     (pow2 y)))

(defn sum-of-squares-two-larger
  [x y z]
  (if (>= x y)
    (if (>= y z)
      (sum-of-squares x y)
      (sum-of-squares x z))
    (if (>= x z)
      (sum-of-squares y x)
      (sum-of-squares y z))))

;; Exercise 1.4  
(defn selects-operator-by-b
  [a b]
  ((if (> b 0) + -) a b))

; Exercise 1.5

(defn p
  []
  (p))

(defn testp
  [x y]
  (if (= x 0)
    0
    y))

;;(testp [] 0 (p))

;; This will blow up the stack due to evaluation of (p). This is
;;consistent with applicative-order evaluation. i.e. arguments are
;;evaluated before application 


;; Exercise 1.6

(defn new-if
  [predicate then-cl else-cl]
  (cond predicate then-cl
        :else else-cl))

(defn improve
  [guess x]
  (let
      [avg (fn [x y] (/ ( + x y) 2))]
    (avg guess (/ x guess))))

(defn abs
  [x]
  (cond (< x 0) (- 0 x)
        :else x))

(defn good-enough?
  [guess x]
  (< (abs (- (* guess guess) x)) 0.001))

(defn sqrt-iter
  [guess x]
  (new-if (good-enough? guess x)
          guess
          (sqrt-iter (improve guess x)
                     x)))


;; Running non-stop, consuming 100% of stack.
;;
;;
;;
