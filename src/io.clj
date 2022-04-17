#!/usr/bin/env clojure -M 
;; Shebang line is inserted

(use 'clojure.java.io) ;; Use the Java I/O library

;; Create a function that will read the contents 
;; of a specified file

(defn file-reader [filename]
(with-open [rdr (reader filename)]
  (doseq [line (line-seq rdr)]
    (println line))))  ;; Print each line in the file

;; Parse command-line arguments
;; Read contents of every file from the arguments

(doseq [arg *command-line-args*]
    (let [filename arg]
    (file-reader filename)))

;; EOF