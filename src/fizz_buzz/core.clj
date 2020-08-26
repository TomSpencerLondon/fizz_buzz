(ns fizz-buzz.core)

(defn- format-output [output current]
  (if (= 3 current)
    (str output "Fizz\n")
    (str output current "\n")))

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
  "I don't do a whole lot ... yet."
  [& args]
  ;; work around dangerous default behaviour in Clojure
  (alter-var-root #'*read-eval* (constantly false))
  (println "Hello, World!"))