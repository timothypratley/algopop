(ns algopop.website.views.products)

(defn products-page []
  [:div
   [:div.jumbotron
    [:h2 "Peer Review Ranking"]
    [:p "Whether you are running a company, or a classroom, you need to reward the best."]]
   [:div
    [:p "You want to identify leaders within your organization.
Simple right?
Send out a survey to nominate co-workers with strong leadership skills.
Is picking the most popular person the best way to identify leaders? No!
Pagerank is the algorithm Google was built upon.
It provides a smart way of finding influential entities."]
    [:p "Our ranking solution provides the algorithm and data import
you need to execute a peer ranking."]]])
