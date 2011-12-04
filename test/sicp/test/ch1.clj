(ns sicp.test.ch1
  (:use [sicp.ch1])
  (:use [clojure.test]))

(deftest ex12-1
  "happy path"
  (is (= -37/150 (ex12))))

(deftest ex13-1
  "happy path"
  (is (= (+
          (* 2 2)
          (* 3 3))
         (ex13 1 2 3))))

(deftest ex13-2
  "Shoud work for negatives as well"
  (is (= (+
          (* -2 -2)
          (* -3 -3))
         (ex13 -5 -2 -3))))
