(ns sicp.chapter1.section2)

(defn- fast-expt-iter
  [b n]
  (loop [n n
         b b
         a 1]
    (cond
     (zero? n) a
     (even? n) (recur (/ n 2) (* b b) a)
     :else (recur (dec n) b (* a b)))))
