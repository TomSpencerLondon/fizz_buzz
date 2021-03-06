(ns fizz-buzz.core)

(defn- format-output [output current]
  (cond
    (= 0 (mod current 15)) (str output "FizzBuzz\n")
    (= 0 (mod current 3)) (str output "Fizz\n")
    (= 0 (mod current 5)) (str output "Buzz\n")
    :else (str output current "\n")))

(defn fizz-buzz-printer
  ([output current limit]
   (let [product (format-output output current)]
     (if (< current limit)
       (fizz-buzz-printer product (+ 1 current) limit)
       product)))
  ([start limit]
   (fizz-buzz-printer "" start limit))
  ([limit]
   (fizz-buzz-printer "" 1 limit)))

(defn -main
  [& args]
  ;; work around dangerous default behaviour in Clojure
  (alter-var-root #'*read-eval* (constantly false))
  (print (fizz-buzz-printer 100)))