(defproject {{name}} "0.1.0-SNAPSHOT"

  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies []

  :profiles {:dev {:dependencies [[riemann "0.3.0"]
                                  [org.clojure/clojure "1.9.0"]]}}

  :resource-paths ["resources" "target/resources"])
