1. RAG documents: Based on the tourism knowledge base, first read and slice the documents, then convert the text into semantic vectors combined with the Embedding model, and store the vector database in PostgreSQL.

2. Model integration: Integrate Tongyi Qianwen and DeepSeek models using SpringAI, design and optimize prompt words, and write query rewriters and retrievers to improve prompt quality.

3. Multi-turn dialogue: Implement the function of dialogue context memory through ChatMemory and interceptors; use the Kryo serialization library to realize the conversion of messages and texts, supporting the persistence of historical dialogues.

4. Agent construction: Develop tools such as online search, PDF generation, resource download, and image search MCP service based on OpenManus's ReAct mode to realize an autonomous planning agent.

5. Front-end development: Use Cursor and design prompt words to develop the front-end interface, solve cross-domain problems through Nginx reverse proxy, and write Dockerfile for project containerization deployment.
