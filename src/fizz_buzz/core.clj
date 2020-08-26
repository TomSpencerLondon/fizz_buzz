(ns fizz-buzz.core)

(defn fizz-buzz-printer [limit]
  "1\n")

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  ;; work around dangerous default behaviour in Clojure
  (alter-var-root #'*read-eval* (constantly false))
  (println "Hello, World!"))