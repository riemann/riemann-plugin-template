(defproject {{name}} ""

  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.8.0"]]

  :profiles {:dev {:dependencies [[riemann "0.2.11"]]}}

  :resource-paths ["resources" "target/resources"])
