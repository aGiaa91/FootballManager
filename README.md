# FootballManager

Class User has id, username and level. Level can be beginner, expert and legend. This should depends on number of won matches, but for now is just sent to constructor.
Class Player has name and rating. If user is beginner it shouldn't be allowed to use players that are high ranking (in real application), but for now is allowed.
Class Club has user, name and list of players. User is allowed to add or remove players from club.
Class Main have function match() which receive list of clubs and returns list of pair clubs (in my case, i was using HashMap - key is one club and value is second club).
Only users with same level can compete against each other.
