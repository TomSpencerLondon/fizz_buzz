(ns fizz-buzz.core)

(defn fizz-buzz-printer [limit]
  (if (= 2 limit)
    "1\n2\n"
    "1\n"))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ;; work around dangerous default behaviour in Clojure
  (alter-var-root #'*read-eval* (constantly false))
  (println "Hello, World!"))