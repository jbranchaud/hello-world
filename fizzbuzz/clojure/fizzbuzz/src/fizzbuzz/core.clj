(ns fizzbuzz.core
  (:gen-class))

(defn fizzbuzz-val [x]
  (if (= 0 (mod x 15))
    "fizzbuzz"
    (if (= 0 (mod x 5))
      "buzz"
      (if (= 0 (mod x 3))
        "fizz"
        (str x)))))

(defn generic-fizzbuzz [x]
  (loop [curr x results []]
    (if (pos? curr)
      (recur (dec curr) (cons (fizzbuzz-val curr) results))
      results)))

(defn fizzbuzz []
  (generic-fizzbuzz 100))

(defn -main
  [& args]
  (doseq [val (fizzbuzz)]
    (println val)))
