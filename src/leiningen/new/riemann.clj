(ns leiningen.new.riemann
  (:require [clojure.java.io :as io]
            [leiningen.new.templates :refer [renderer name-to-path ->files]]))

(def render (renderer "riemann"))

(defn riemann
  "Create a new Riemann plugin"
  [name]
  (println "Creating a new Riemann plugin...")
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (->files data
             ["project.clj" (render "project.clj" data)]
             [".gitignore" (render "gitignore" data)]
             ["LICENSE" (render "LICENSE" data)]
             ["README.md" (render "README.md" data)]
             ["resources/riemann_plugin/{{sanitized}}/meta.edn" (render "meta.edn" data)]
             ["src/{{sanitized}}/core.clj" (render "core.clj" data)]
             ["test/{{sanitized}}/core_test.clj" (render "core_test.clj" data)]))
  (println "Created!"))
