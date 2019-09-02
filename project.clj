(defproject algopop/website "0.1.0-SNAPSHOT"
  :description "Algopop Website"
  :url "http://timothypratley.blogspot.com"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/clojurescript "1.10.520" :scope "provided"]
                 [cljsjs/react "16.8.6-0"]
                 [reagent "0.8.1"]
                 [reagent-forms "0.5.43"]
                 [reagent-utils "0.3.3"]
                 [secretary "1.2.3"]]

  :plugins [[lein-cljsbuild "1.1.7"]
            [lein-environ "1.0.2"]
            [lein-asset-minifier "0.4.6"]]

  :min-lein-version "2.5.0"

  :clean-targets ^{:protect false} ["resources/public/js"]

  :minify-assets
  {:assets
    {"resources/public/css/site.min.css" "resources/public/css/site.css"}}

  :cljsbuild {:builds {:app {:compiler {:output-to "resources/public/js/website.js"
                                        :output-dir "resources/public/js/out"
                                        :asset-path "js/out"
                                        :optimizations :none
                                        :pretty-print true}}}}

  :profiles {:dev {:repl-options {:init-ns repl
                                  :nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}

                   :dependencies [[figwheel "0.5.19"]
                                  [weasel "0.7.0"]
                                  [com.cemerick/piggieback "0.2.2"]
                                  [org.clojure/tools.nrepl "0.2.13"]]

                   :source-paths ["env/dev/clj" "src"]
                   :plugins [[lein-figwheel "0.5.19"]]

                   :figwheel {:http-server-root "public"
                              :server-port 3449
                              :css-dirs ["resources/public/css"]}

                   :env {:dev? true}

                   :cljsbuild {:builds {:app {:source-paths ["env/dev/cljs" "src"]
                                              :compiler {:main "algopop.website.dev"
                                                         :source-map true}}}}}

             :uberjar {:hooks [leiningen.cljsbuild minify-assets.plugin/hooks]
                       :env {:production true}
                       :aot :all
                       :omit-source true
                       :cljsbuild {:jar true
                                   :builds {:app
                                             {:source-paths ["env/prod/cljs" "src"]
                                              :compiler
                                              {:optimizations :advanced
                                               :pretty-print false}}}}}})
