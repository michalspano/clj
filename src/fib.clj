#!/usr/bin/env clojure -M

;; Sources: https://yankev.github.io/2017/05/15/fib_clj.html

(defn fib-sum [n]
 (case n
    0 0                                       ;; Base case
    1 1                                       ;; Base case
    (+ (fib-sum (- n 1)) (fib-sum (- n 2))))  ;; Recursive case
)

(def fib-seq
  (lazy-cat [0 1] (map + (rest fib-seq) fib-seq))
)  ;; Map the terms

(defn main [n]

    ;; Call the function to compute the n-th 
    ;; term of the first n Fibonacci numbers

    (println (str "The " n "-th term of Fibonacci sequence is: '" (fib-sum n) "'"))

    ;; Print the n terms of the sequence
    ;; to the standard output

    (print "Sequence: ")
    (println (take n (drop 1 fib-seq)))
)

(main 10) ;; call the main function

;; EOF