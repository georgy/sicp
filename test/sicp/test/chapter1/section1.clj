(ns sicp.test.chapter1.section1
  (:use [sicp.chapter1.section1])
  (:use [clojure.test]))

(deftest ex12-1
  "happy path"
  (is (= -37/150 (ex12))))

(deftest sum-of-squares-two-larger-1
  "happy path"
  (is (= (+
          (* 2 2)
          (* 3 3))
         (sum-of-squares-two-larger 1 2 3))))

(deftest sum-of-squares-two-larger-2
  "Shoud work for negatives as well"
  (is (= (+
          (* -2 -2)
          (* -3 -3))
         (sum-of-squares-two-larger -5 -2 -3))))

(deftest selects-operator-by-b-1
  "happy path"
  (is (=
       (selects-operator-by-b 1 2)
       (selects-operator-by-b 1 -2))))
