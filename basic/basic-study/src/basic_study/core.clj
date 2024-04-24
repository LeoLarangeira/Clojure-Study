(ns basic-study.core
  (:gen-class)
  (:require [basic-study.log-level.exer :as lg]
            [basic-study.bob.exer :as bob]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (bob/contains-letter? ":) ?"))

  (println "[SURE.] --> RETURN")
  (println (bob/response-for "How are you?"))
  (println "")
  (println "[SURE.] --> RETURN")
  (println (bob/response-for "3?"))
  (println "")
  (println "[SURE.] --> RETURN")
  (println (bob/response-for ":) ?"))

  (println "")
  (println "[WHOA, CHILL OUT!] ---> RETURN")
  (println (bob/response-for "YELL AT HIM"))

  (println "")
  (println "[CALM DOWN, I KNOW WHAT I'M DOING!] ---> RETURN")
  (println (bob/response-for "YELL AT HIM?"))

  (println "")
  (println "[FINE. BE THAT WAY!] ---> RETURN")
  (println (bob/response-for "       "))

  (println "")
  (println "[WHATEVER.] ---> RETURN")
  (println (bob/response-for "teste"))


  (println "")
  (println "[WHATEVER.] ---> RETURN")
  (println (bob/response-for "1,2,3")))
