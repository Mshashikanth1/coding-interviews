public class EdraLabs {

    /**
    * first round is a maching coding round:
    *
    *
    * Design a server capable of generating, assigning, and managing API keys with specific functionalities.
		 The server should offer various endpoints for interaction:
		 An endpoint to create new keys.
		 Each generated key has a life of 5 minutes after which it gets deleted automatically if keep-alive operation is not run for that key (More details mentioned below).

		 An endpoint to retrieve an available key, ensuring the key is randomly selected and not currently in use.
		 This key should then be blocked from being served again until its status changes. If no keys are available, a 404 error should be returned.

		 An endpoint to unblock a previously assigned key, making it available for reuse.
		 An endpoint to permanently remove a key from the system.
		 An endpoint for key keep-alive functionality, requiring clients to signal every 5 minutes to prevent the key from being deleted.
		 Automatically release blocked keys within 60 seconds if not unblocked explicitly.
		 Constraints:
		 Ensuring efficient key management without the need to iterate through all keys for any operation. The complexity of endpoint requests should be aimed at O(log n) or O(1) for scalability and efficiency.

		 Post( /keys: Generate new keys.
		 Status: 201


		 GET /keys: Retrieve an available key for client use.
		 Status: 200 / 404
		 Response: { "keyId": "<keyID>" } / {}


		 GET /keys/:id: Provide information (e.g., assignment timestamps) about a specific key.
		 Status: 200 / 404
		 Response:
		 {
		 "isBlocked" : "<true> / <false>",
		 "blockedAt" : "<blockedTime>",
		 "createdAt" : "<createdTime>"
		 } / {}



		 DELETE /keys/:id: Remove a specific key, identified by :id, from the system.
		 Status: 200 / 404



		 PUT /keys/:id: Unblock a key for further use.
		 Status: 200 / 404




		 PUT /keepalive/:id: Signal the server to keep the specified key, identified by :id, from being deleted.
		 Status: 200 / 404
		 *
		 *
		 *
		 *

*      Second round:
*       1. what is recent project
*       2. what are the issues with you project,
*       3. if you are about to design the project from scratch what will be your approach
*       4. if the integer range in  a new programming language is only 0 to 99 , then how will you
*           manage the arthritic operations of 4 digit numbers
*
*
*
*
*
*
*
*
*
    * */
}
