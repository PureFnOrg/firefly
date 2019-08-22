(defproject org.purefn/firefly "0.1.0-SNAPSHOT"
  :description "Prometheus ring middleware"
  :url "https://github.com/PureFnOrg/firefly"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [io.prometheus/simpleclient "0.6.0"]]
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.2.11"]
                                  [com.stuartsierra/component "0.3.2"]
                                  [com.stuartsierra/component.repl "0.2.0"]]
                   :source-paths ["dev"]}})
