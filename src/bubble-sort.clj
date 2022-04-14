#!/usr/bin/env clojure -M

;; Implementing the Bubble Sort algorithm in Clojure

(defn bubble-step [ys x]
  (if-let [y (peek ys)]
    (if (> y x)
      (conj (pop ys) x y)
      (conj ys x))
    [x]))

(defn bubble-sort [xs]
  (let [ys (reduce bubble-step [] xs)]
    (if (= xs ys)
      xs
      (recur ys))))

;; Create a function that will create a list of random integers
;; Expected length of n, integers between 0 and 20

(defn random-list [n]
    (take n (repeatedly #(rand-int 20))))

;; Store the computed sequence of integers in a variable
;; Print the unsorted/sorted sequence, choose length of 10

(let [numbers (random-list 10)]
  (println "Unsorted sequence:  " numbers)
  (println "Sorted sequence:    " (bubble-sort numbers)))
