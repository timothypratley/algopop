(ns algopop.website.app.views.algorithms)

(defn algorithms-page []
  [:div
   [:h2 "Ranking"]
   [:p "You want to identify leaders within your organization."]
   [:p "Simple right? Send out a brief survey asking everyone to nominate co-workers with strong leadership skills."]
   [:p "Now is picking the most popular person the best way to identify leaders? No!"]
   [:p "Page rank is the algorithm Google was built upon. It provides a much better way of finding influential entities."]])
