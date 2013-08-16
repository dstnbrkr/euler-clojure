(ns net.dstnbrkr.euler.core)

(defn -main [& args]
  (let [problem (first args)
        fn (symbol problem)
        ns (symbol (str "net.dstnbrkr.euler." problem))]
    (require ns)
    (println (apply (ns-resolve ns fn) []))))



