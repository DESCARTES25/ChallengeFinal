package com.challenge.dijsktra.app;

import com.challenge.dijsktra.app.algorithm.*;
import com.challenge.dijsktra.app.model.City;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class DijkstraAlgorithmLongRunningUnitTest {
	@Test
	public void whenDijkstra_ShortestTime_three_nodes_starting_A() {

		Node nodeA = new Node(new City("A"));
		Node nodeB = new Node(new City("B"));
		Node nodeC = new Node(new City("C"));

		nodeA.addDestination(nodeB, 5);
		nodeA.addDestination(nodeC, 2);

		nodeB.addDestination(nodeA, 6);
		nodeC.addDestination(nodeA, 3);

		Graph graph = new Graph();

		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);

		graph = Dijkstra.calculateShortestPathFromSource(graph, nodeA);

		List<Node> shortestPathForNodeAB = Arrays.asList(nodeA);
		List<Node> shortestPathForNodeAC = Arrays.asList(nodeA);

		for (Node node : graph.getNodes()) {
			switch (node.getCity().getName()) {
			case "B":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeAB));
				break;
			case "C":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeAC));

				break;
			}
		}

	}

	@Test
	public void whenDijkstra_ShortestTime_three_nodes_starting_B() {

		Node nodeA = new Node(new City("A"));
		Node nodeB = new Node(new City("B"));
		Node nodeC = new Node(new City("C"));

		nodeA.addDestination(nodeB, 5);
		nodeA.addDestination(nodeC, 2);

		nodeB.addDestination(nodeA, 6);
		nodeC.addDestination(nodeA, 3);

		Graph graph = new Graph();

		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);

		graph = Dijkstra.calculateShortestPathFromSource(graph, nodeB);

		List<Node> shortestPathForNodeBA = Arrays.asList(nodeB);
		List<Node> shortestPathForNodeBC = Arrays.asList(nodeB, nodeA);

		for (Node node : graph.getNodes()) {
			switch (node.getCity().getName()) {
			case "A":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeBA));
				break;
			case "C":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeBC));

				break;
			}
		}

	}

	@Test
	public void whenDijkstra_ShortestTime_three_nodes_starting_C() {

		Node nodeA = new Node(new City("A"));
		Node nodeB = new Node(new City("B"));
		Node nodeC = new Node(new City("C"));

		nodeA.addDestination(nodeB, 5);
		nodeA.addDestination(nodeC, 2);

		nodeB.addDestination(nodeA, 6);
		nodeC.addDestination(nodeA, 3);

		Graph graph = new Graph();

		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);

		graph = Dijkstra.calculateShortestPathFromSource(graph, nodeC);

		List<Node> shortestPathForNodeCA = Arrays.asList(nodeC);
		List<Node> shortestPathForNodeCB = Arrays.asList(nodeC, nodeA);

		for (Node node : graph.getNodes()) {
			switch (node.getCity().getName()) {
			case "A":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeCA));
				break;
			case "B":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeCB));
				break;
			}
		}

	}

	@Test
	public void whenDijkstra_ShortestTime_four_nodes_starting_D() {

		Node nodeA = new Node(new City("A"));
		Node nodeB = new Node(new City("B"));
		Node nodeC = new Node(new City("C"));
		Node nodeD = new Node(new City("D"));

		nodeA.addDestination(nodeB, 3);
		nodeA.addDestination(nodeC, 6);

		nodeB.addDestination(nodeA, 2);
		nodeC.addDestination(nodeA, 5);

		nodeB.addDestination(nodeD, 2);
		nodeD.addDestination(nodeB, 3);

		nodeC.addDestination(nodeD, 9);
		nodeD.addDestination(nodeC, 7);

		Graph graph = new Graph();

		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);

		graph = Dijkstra.calculateShortestPathFromSource(graph, nodeD);

		List<Node> shortestPathForNodeDA = Arrays.asList(nodeD, nodeB);
		List<Node> shortestPathForNodeDB = Arrays.asList(nodeD);
		List<Node> shortestPathForNodeDC = Arrays.asList(nodeD);

		for (Node node : graph.getNodes()) {
			switch (node.getCity().getName()) {
			case "A":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeDA));
				break;
			case "B":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeDB));
				break;
			case "C":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeDC));
				break;
			}
		}

	}

	@Test
	public void whenDijkstra_ShortestTime_four_nodes_starting_A() {

		Node nodeA = new Node(new City("A"));
		Node nodeB = new Node(new City("B"));
		Node nodeC = new Node(new City("C"));
		Node nodeD = new Node(new City("D"));

		nodeA.addDestination(nodeB, 3);
		nodeA.addDestination(nodeC, 6);

		nodeB.addDestination(nodeA, 2);
		nodeC.addDestination(nodeA, 5);

		nodeB.addDestination(nodeD, 2);
		nodeD.addDestination(nodeB, 3);

		nodeC.addDestination(nodeD, 9);
		nodeD.addDestination(nodeC, 7);

		Graph graph = new Graph();

		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);

		graph = Dijkstra.calculateShortestPathFromSource(graph, nodeA);

		List<Node> shortestPathForNodeAB = Arrays.asList(nodeA);
		List<Node> shortestPathForNodeAC = Arrays.asList(nodeA);
		List<Node> shortestPathForNodeAD = Arrays.asList(nodeA, nodeB);

		for (Node node : graph.getNodes()) {
			switch (node.getCity().getName()) {
			case "B":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeAB));
				break;
			case "C":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeAC));
				break;
			case "D":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeAD));
				break;
			}
		}

	}

	@Test
	public void whenDijkstra_ShortestTime_four_nodes_starting_B() {

		Node nodeA = new Node(new City("A"));
		Node nodeB = new Node(new City("B"));
		Node nodeC = new Node(new City("C"));
		Node nodeD = new Node(new City("D"));

		nodeA.addDestination(nodeB, 3);
		nodeA.addDestination(nodeC, 6);

		nodeB.addDestination(nodeA, 2);
		nodeC.addDestination(nodeA, 5);

		nodeB.addDestination(nodeD, 2);
		nodeD.addDestination(nodeB, 3);

		nodeC.addDestination(nodeD, 9);
		nodeD.addDestination(nodeC, 7);

		Graph graph = new Graph();

		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);

		graph = Dijkstra.calculateShortestPathFromSource(graph, nodeB);

		List<Node> shortestPathForNodeBA = Arrays.asList(nodeB);
		List<Node> shortestPathForNodeBC = Arrays.asList(nodeB, nodeA);
		List<Node> shortestPathForNodeBD = Arrays.asList(nodeB);

		for (Node node : graph.getNodes()) {
			switch (node.getCity().getName()) {
			case "A":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeBA));
				break;
			case "C":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeBC));
				break;
			case "D":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeBD));
				break;
			}
		}

	}

	@Test
	public void whenDijkstra_ShortestTime_four_nodes_starting_C() {

		Node nodeA = new Node(new City("A"));
		Node nodeB = new Node(new City("B"));
		Node nodeC = new Node(new City("C"));
		Node nodeD = new Node(new City("D"));

		nodeA.addDestination(nodeB, 3);
		nodeA.addDestination(nodeC, 6);

		nodeB.addDestination(nodeA, 2);
		nodeC.addDestination(nodeA, 5);

		nodeB.addDestination(nodeD, 2);
		nodeD.addDestination(nodeB, 3);

		nodeC.addDestination(nodeD, 9);
		nodeD.addDestination(nodeC, 7);

		Graph graph = new Graph();

		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);

		graph = Dijkstra.calculateShortestPathFromSource(graph, nodeC);

		List<Node> shortestPathForNodeCA = Arrays.asList(nodeC);
		List<Node> shortestPathForNodeCB = Arrays.asList(nodeC, nodeA);
		List<Node> shortestPathForNodeCD = Arrays.asList(nodeC);

		for (Node node : graph.getNodes()) {
			switch (node.getCity().getName()) {
			case "A":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeCA));
				break;
			case "B":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeCB));
				break;
			case "D":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeCD));
				break;
			}
		}

	}

	@Test
	public void whenDijkstra_ShortestTime_five_nodes_starting_E() {

		Node nodeA = new Node(new City("A"));
		Node nodeB = new Node(new City("B"));
		Node nodeC = new Node(new City("C"));
		Node nodeD = new Node(new City("D"));
		Node nodeE = new Node(new City("E"));

		nodeA.addDestination(nodeB, 3);
		nodeA.addDestination(nodeC, 6);

		nodeB.addDestination(nodeA, 2);
		nodeC.addDestination(nodeA, 5);

		nodeB.addDestination(nodeD, 2);
		nodeD.addDestination(nodeB, 3);

		nodeC.addDestination(nodeD, 9);
		nodeD.addDestination(nodeC, 7);

		nodeE.addDestination(nodeD, 7);
		nodeD.addDestination(nodeE, 9);

		nodeB.addDestination(nodeE, 10);
		nodeE.addDestination(nodeB, 8);

		Graph graph = new Graph();

		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);
		graph.addNode(nodeE);

		graph = Dijkstra.calculateShortestPathFromSource(graph, nodeE);

		List<Node> shortestPathForNodeEA = Arrays.asList(nodeE, nodeB);
		List<Node> shortestPathForNodeEB = Arrays.asList(nodeE);
		List<Node> shortestPathForNodeEC = Arrays.asList(nodeE, nodeD);
		List<Node> shortestPathForNodeED = Arrays.asList(nodeE);

		for (Node node : graph.getNodes()) {
			switch (node.getCity().getName()) {
			case "A":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeEA));
				break;
			case "B":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeEB));
				break;
			case "C":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeEC));
				break;
			case "D":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeED));
				break;
			}
		}

	}

	@Test
	public void whenDijkstra_ShortestTime_five_nodes_starting_A() {

		Node nodeA = new Node(new City("A"));
		Node nodeB = new Node(new City("B"));
		Node nodeC = new Node(new City("C"));
		Node nodeD = new Node(new City("D"));
		Node nodeE = new Node(new City("E"));

		nodeA.addDestination(nodeB, 3);
		nodeA.addDestination(nodeC, 6);

		nodeB.addDestination(nodeA, 2);
		nodeC.addDestination(nodeA, 5);

		nodeB.addDestination(nodeD, 2);
		nodeD.addDestination(nodeB, 3);

		nodeC.addDestination(nodeD, 9);
		nodeD.addDestination(nodeC, 7);

		nodeE.addDestination(nodeD, 7);
		nodeD.addDestination(nodeE, 9);

		nodeB.addDestination(nodeE, 10);
		nodeE.addDestination(nodeB, 8);

		Graph graph = new Graph();

		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);
		graph.addNode(nodeE);

		graph = Dijkstra.calculateShortestPathFromSource(graph, nodeA);

		List<Node> shortestPathForNodeAB = Arrays.asList(nodeA);
		List<Node> shortestPathForNodeAC = Arrays.asList(nodeA);
		List<Node> shortestPathForNodeAD = Arrays.asList(nodeA, nodeB);
		List<Node> shortestPathForNodeAE = Arrays.asList(nodeA, nodeB);

		for (Node node : graph.getNodes()) {
			switch (node.getCity().getName()) {
			case "B":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeAB));
				break;
			case "C":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeAC));
				break;
			case "D":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeAD));
				break;
			case "E":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeAE));
				break;

			}
		}

	}

	@Test
	public void whenDijkstra_ShortestTime_five_nodes_starting_B() {

		Node nodeA = new Node(new City("A"));
		Node nodeB = new Node(new City("B"));
		Node nodeC = new Node(new City("C"));
		Node nodeD = new Node(new City("D"));
		Node nodeE = new Node(new City("E"));

		nodeA.addDestination(nodeB, 3);
		nodeA.addDestination(nodeC, 6);

		nodeB.addDestination(nodeA, 2);
		nodeC.addDestination(nodeA, 5);

		nodeB.addDestination(nodeD, 2);
		nodeD.addDestination(nodeB, 3);

		nodeC.addDestination(nodeD, 9);
		nodeD.addDestination(nodeC, 7);

		nodeE.addDestination(nodeD, 7);
		nodeD.addDestination(nodeE, 9);

		nodeB.addDestination(nodeE, 10);
		nodeE.addDestination(nodeB, 8);

		Graph graph = new Graph();

		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);
		graph.addNode(nodeE);

		graph = Dijkstra.calculateShortestPathFromSource(graph, nodeB);

		List<Node> shortestPathForNodeBA = Arrays.asList(nodeB);
		List<Node> shortestPathForNodeBC = Arrays.asList(nodeB, nodeA);
		List<Node> shortestPathForNodeBD = Arrays.asList(nodeB);
		List<Node> shortestPathForNodeBE = Arrays.asList(nodeB);

		for (Node node : graph.getNodes()) {
			switch (node.getCity().getName()) {
			case "A":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeBA));
				break;
			case "C":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeBC));
				break;
			case "D":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeBD));
				break;
			case "E":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeBE));
				break;

			}
		}

	}

	@Test
	public void whenDijkstra_ShortestTime_five_nodes_starting_C() {

		Node nodeA = new Node(new City("A"));
		Node nodeB = new Node(new City("B"));
		Node nodeC = new Node(new City("C"));
		Node nodeD = new Node(new City("D"));
		Node nodeE = new Node(new City("E"));

		nodeA.addDestination(nodeB, 3);
		nodeA.addDestination(nodeC, 6);

		nodeB.addDestination(nodeA, 2);
		nodeC.addDestination(nodeA, 5);

		nodeB.addDestination(nodeD, 2);
		nodeD.addDestination(nodeB, 3);

		nodeC.addDestination(nodeD, 9);
		nodeD.addDestination(nodeC, 7);

		nodeE.addDestination(nodeD, 7);
		nodeD.addDestination(nodeE, 9);

		nodeB.addDestination(nodeE, 10);
		nodeE.addDestination(nodeB, 8);

		Graph graph = new Graph();

		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);
		graph.addNode(nodeE);

		graph = Dijkstra.calculateShortestPathFromSource(graph, nodeC);

		List<Node> shortestPathForNodeCA = Arrays.asList(nodeC);
		List<Node> shortestPathForNodeCB = Arrays.asList(nodeC, nodeA);
		List<Node> shortestPathForNodeCD = Arrays.asList(nodeC);
		List<Node> shortestPathForNodeCE = Arrays.asList(nodeC, nodeA, nodeB);

		for (Node node : graph.getNodes()) {
			switch (node.getCity().getName()) {
			case "A":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeCA));
				break;
			case "B":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeCB));
				break;
			case "D":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeCD));
				break;
			case "E":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeCE));
				break;

			}
		}

	}

	@Test
	public void whenDijkstra_ShortestTime_five_nodes_starting_D() {

		Node nodeA = new Node(new City("A"));
		Node nodeB = new Node(new City("B"));
		Node nodeC = new Node(new City("C"));
		Node nodeD = new Node(new City("D"));
		Node nodeE = new Node(new City("E"));

		nodeA.addDestination(nodeB, 3);
		nodeA.addDestination(nodeC, 6);

		nodeB.addDestination(nodeA, 2);
		nodeC.addDestination(nodeA, 5);

		nodeB.addDestination(nodeD, 2);
		nodeD.addDestination(nodeB, 3);

		nodeC.addDestination(nodeD, 9);
		nodeD.addDestination(nodeC, 7);

		nodeE.addDestination(nodeD, 7);
		nodeD.addDestination(nodeE, 9);

		nodeB.addDestination(nodeE, 10);
		nodeE.addDestination(nodeB, 8);

		Graph graph = new Graph();

		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);
		graph.addNode(nodeE);

		graph = Dijkstra.calculateShortestPathFromSource(graph, nodeD);

		List<Node> shortestPathForNodeDA = Arrays.asList(nodeD, nodeB);
		List<Node> shortestPathForNodeDB = Arrays.asList(nodeD);
		List<Node> shortestPathForNodeDC = Arrays.asList(nodeD);
		List<Node> shortestPathForNodeDE = Arrays.asList(nodeD);

		for (Node node : graph.getNodes()) {
			switch (node.getCity().getName()) {
			case "A":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeDA));
				break;
			case "B":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeDB));
				break;
			case "C":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeDC));
				break;
			case "E":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeDE));
				break;

			}
		}

	}

	@Test
	public void whenDijkstra_ShortestTime_six_nodes_starting_F() {

		Node nodeA = new Node(new City("A"));
		Node nodeB = new Node(new City("B"));
		Node nodeC = new Node(new City("C"));
		Node nodeD = new Node(new City("D"));
		Node nodeE = new Node(new City("E"));
		Node nodeF = new Node(new City("F"));

		nodeA.addDestination(nodeB, 3);
		nodeA.addDestination(nodeC, 6);

		nodeB.addDestination(nodeA, 2);
		nodeC.addDestination(nodeA, 5);

		nodeB.addDestination(nodeD, 2);
		nodeD.addDestination(nodeB, 3);

		nodeC.addDestination(nodeD, 9);
		nodeD.addDestination(nodeC, 7);

		nodeE.addDestination(nodeD, 7);
		nodeD.addDestination(nodeE, 9);

		nodeB.addDestination(nodeE, 10);
		nodeE.addDestination(nodeB, 8);

		nodeF.addDestination(nodeA, 4);
		nodeA.addDestination(nodeF, 5);
		nodeF.addDestination(nodeC, 1);
		nodeC.addDestination(nodeF, 2);
		nodeF.addDestination(nodeD, 3);
		nodeD.addDestination(nodeF, 3);

		Graph graph = new Graph();

		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);
		graph.addNode(nodeE);
		graph.addNode(nodeF);

		graph = Dijkstra.calculateShortestPathFromSource(graph, nodeF);

		List<Node> shortestPathForNodeFA = Arrays.asList(nodeF);
		List<Node> shortestPathForNodeFB = Arrays.asList(nodeF,nodeD);
		List<Node> shortestPathForNodeFC = Arrays.asList(nodeF);
		List<Node> shortestPathForNodeFD = Arrays.asList(nodeF);
		List<Node> shortestPathForNodeFE = Arrays.asList(nodeF,nodeD);
		
		for (Node node : graph.getNodes()) {
			switch (node.getCity().getName()) {
			case "A":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeFA));
				break;
			case "B":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeFB));
				break;
			case "C":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeFC));
				break;
			case "D":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeFD));
				break;
			case "E":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeFE));
				break;

			}
		}

	}


	@Test
	public void whenDijkstra_ShortestTime_six_nodes_starting_A() {

		Node nodeA = new Node(new City("A"));
		Node nodeB = new Node(new City("B"));
		Node nodeC = new Node(new City("C"));
		Node nodeD = new Node(new City("D"));
		Node nodeE = new Node(new City("E"));
		Node nodeF = new Node(new City("F"));

		nodeA.addDestination(nodeB, 3);
		nodeA.addDestination(nodeC, 6);

		nodeB.addDestination(nodeA, 2);
		nodeC.addDestination(nodeA, 5);

		nodeB.addDestination(nodeD, 2);
		nodeD.addDestination(nodeB, 3);

		nodeC.addDestination(nodeD, 9);
		nodeD.addDestination(nodeC, 7);

		nodeE.addDestination(nodeD, 7);
		nodeD.addDestination(nodeE, 9);

		nodeB.addDestination(nodeE, 10);
		nodeE.addDestination(nodeB, 8);

		nodeF.addDestination(nodeA, 4);
		nodeA.addDestination(nodeF, 5);
		nodeF.addDestination(nodeC, 1);
		nodeC.addDestination(nodeF, 2);
		nodeF.addDestination(nodeD, 3);
		nodeD.addDestination(nodeF, 3);

		Graph graph = new Graph();

		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);
		graph.addNode(nodeE);
		graph.addNode(nodeF);

		graph = Dijkstra.calculateShortestPathFromSource(graph, nodeA);

		List<Node> shortestPathForNodeAB = Arrays.asList(nodeA);
		List<Node> shortestPathForNodeAC = Arrays.asList(nodeA);
		List<Node> shortestPathForNodeAD = Arrays.asList(nodeA,nodeB);
		List<Node> shortestPathForNodeAE = Arrays.asList(nodeA,nodeB);
		List<Node> shortestPathForNodeAF = Arrays.asList(nodeA);
		
		for (Node node : graph.getNodes()) {
			switch (node.getCity().getName()) {
			case "B":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeAB));
				break;
			case "C":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeAC));
				break;
			case "D":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeAD));
				break;
			case "E":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeAE));
				break;
			case "F":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeAF));
				break;
			}
		}

	}


	@Test
	public void whenDijkstra_ShortestTime_six_nodes_starting_B() {

		Node nodeA = new Node(new City("A"));
		Node nodeB = new Node(new City("B"));
		Node nodeC = new Node(new City("C"));
		Node nodeD = new Node(new City("D"));
		Node nodeE = new Node(new City("E"));
		Node nodeF = new Node(new City("F"));

		nodeA.addDestination(nodeB, 3);
		nodeA.addDestination(nodeC, 6);

		nodeB.addDestination(nodeA, 2);
		nodeC.addDestination(nodeA, 5);

		nodeB.addDestination(nodeD, 2);
		nodeD.addDestination(nodeB, 3);

		nodeC.addDestination(nodeD, 9);
		nodeD.addDestination(nodeC, 7);

		nodeE.addDestination(nodeD, 7);
		nodeD.addDestination(nodeE, 9);

		nodeB.addDestination(nodeE, 10);
		nodeE.addDestination(nodeB, 8);

		nodeF.addDestination(nodeA, 4);
		nodeA.addDestination(nodeF, 5);
		nodeF.addDestination(nodeC, 1);
		nodeC.addDestination(nodeF, 2);
		nodeF.addDestination(nodeD, 3);
		nodeD.addDestination(nodeF, 3);

		Graph graph = new Graph();

		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);
		graph.addNode(nodeE);
		graph.addNode(nodeF);

		graph = Dijkstra.calculateShortestPathFromSource(graph, nodeB);

		List<Node> shortestPathForNodeBA = Arrays.asList(nodeB);
		List<Node> shortestPathForNodeBC = Arrays.asList(nodeB,nodeD,nodeF);
		List<Node> shortestPathForNodeBD = Arrays.asList(nodeB);
		List<Node> shortestPathForNodeBE = Arrays.asList(nodeB);
		List<Node> shortestPathForNodeBF = Arrays.asList(nodeB,nodeD);
		
		for (Node node : graph.getNodes()) {
			switch (node.getCity().getName()) {
			case "A":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeBA));
				break;
			case "C":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeBC));
				break;
			case "D":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeBD));
				break;
			case "E":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeBE));
				break;
			case "F":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeBF));
				break;
			}
		}

	}
	
	

	@Test
	public void whenDijkstra_ShortestTime_six_nodes_starting_C() {

		Node nodeA = new Node(new City("A"));
		Node nodeB = new Node(new City("B"));
		Node nodeC = new Node(new City("C"));
		Node nodeD = new Node(new City("D"));
		Node nodeE = new Node(new City("E"));
		Node nodeF = new Node(new City("F"));

		nodeA.addDestination(nodeB, 3);
		nodeA.addDestination(nodeC, 6);

		nodeB.addDestination(nodeA, 2);
		nodeC.addDestination(nodeA, 5);

		nodeB.addDestination(nodeD, 2);
		nodeD.addDestination(nodeB, 3);

		nodeC.addDestination(nodeD, 9);
		nodeD.addDestination(nodeC, 7);

		nodeE.addDestination(nodeD, 7);
		nodeD.addDestination(nodeE, 9);

		nodeB.addDestination(nodeE, 10);
		nodeE.addDestination(nodeB, 8);

		nodeF.addDestination(nodeA, 4);
		nodeA.addDestination(nodeF, 5);
		nodeF.addDestination(nodeC, 1);
		nodeC.addDestination(nodeF, 2);
		nodeF.addDestination(nodeD, 3);
		nodeD.addDestination(nodeF, 3);

		Graph graph = new Graph();

		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);
		graph.addNode(nodeE);
		graph.addNode(nodeF);

		graph = Dijkstra.calculateShortestPathFromSource(graph, nodeC);

		List<Node> shortestPathForNodeCA = Arrays.asList(nodeC);
		List<Node> shortestPathForNodeCB = Arrays.asList(nodeC,nodeF,nodeD);
		List<Node> shortestPathForNodeCD = Arrays.asList(nodeC,nodeF);
		List<Node> shortestPathForNodeCE = Arrays.asList(nodeC,nodeF,nodeD);
		List<Node> shortestPathForNodeCF = Arrays.asList(nodeC);
		
		for (Node node : graph.getNodes()) {
			switch (node.getCity().getName()) {
			case "A":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeCA));
				break;
			case "B":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeCB));
				break;
			case "D":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeCD));
				break;
			case "E":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeCE));
				break;
			case "F":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeCF));
				break;
			}
		}

	}


	@Test
	public void whenDijkstra_ShortestTime_six_nodes_starting_D() {

		Node nodeA = new Node(new City("A"));
		Node nodeB = new Node(new City("B"));
		Node nodeC = new Node(new City("C"));
		Node nodeD = new Node(new City("D"));
		Node nodeE = new Node(new City("E"));
		Node nodeF = new Node(new City("F"));

		nodeA.addDestination(nodeB, 3);
		nodeA.addDestination(nodeC, 6);

		nodeB.addDestination(nodeA, 2);
		nodeC.addDestination(nodeA, 5);

		nodeB.addDestination(nodeD, 2);
		nodeD.addDestination(nodeB, 3);

		nodeC.addDestination(nodeD, 9);
		nodeD.addDestination(nodeC, 7);

		nodeE.addDestination(nodeD, 7);
		nodeD.addDestination(nodeE, 9);

		nodeB.addDestination(nodeE, 10);
		nodeE.addDestination(nodeB, 8);

		nodeF.addDestination(nodeA, 4);
		nodeA.addDestination(nodeF, 5);
		nodeF.addDestination(nodeC, 1);
		nodeC.addDestination(nodeF, 2);
		nodeF.addDestination(nodeD, 3);
		nodeD.addDestination(nodeF, 3);

		Graph graph = new Graph();

		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);
		graph.addNode(nodeE);
		graph.addNode(nodeF);

		graph = Dijkstra.calculateShortestPathFromSource(graph, nodeD);

		List<Node> shortestPathForNodeDA = Arrays.asList(nodeD,nodeB);
		List<Node> shortestPathForNodeDB = Arrays.asList(nodeD);
		List<Node> shortestPathForNodeDC = Arrays.asList(nodeD,nodeF);
		List<Node> shortestPathForNodeDE = Arrays.asList(nodeD);
		List<Node> shortestPathForNodeDF = Arrays.asList(nodeD);
		
		for (Node node : graph.getNodes()) {
			switch (node.getCity().getName()) {
			case "A":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeDA));
				break;
			case "B":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeDB));
				break;
			case "C":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeDC));
				break;
			case "E":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeDE));
				break;
			case "F":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeDF));
				break;
			}
		}

	}


	@Test
	public void whenDijkstra_ShortestTime_six_nodes_starting_E() {

		Node nodeA = new Node(new City("A"));
		Node nodeB = new Node(new City("B"));
		Node nodeC = new Node(new City("C"));
		Node nodeD = new Node(new City("D"));
		Node nodeE = new Node(new City("E"));
		Node nodeF = new Node(new City("F"));

		nodeA.addDestination(nodeB, 3);
		nodeA.addDestination(nodeC, 6);

		nodeB.addDestination(nodeA, 2);
		nodeC.addDestination(nodeA, 5);

		nodeB.addDestination(nodeD, 2);
		nodeD.addDestination(nodeB, 3);

		nodeC.addDestination(nodeD, 9);
		nodeD.addDestination(nodeC, 7);

		nodeE.addDestination(nodeD, 7);
		nodeD.addDestination(nodeE, 9);

		nodeB.addDestination(nodeE, 10);
		nodeE.addDestination(nodeB, 8);

		nodeF.addDestination(nodeA, 4);
		nodeA.addDestination(nodeF, 5);
		nodeF.addDestination(nodeC, 1);
		nodeC.addDestination(nodeF, 2);
		nodeF.addDestination(nodeD, 3);
		nodeD.addDestination(nodeF, 3);

		Graph graph = new Graph();

		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);
		graph.addNode(nodeE);
		graph.addNode(nodeF);

		graph = Dijkstra.calculateShortestPathFromSource(graph, nodeE);

		List<Node> shortestPathForNodeEA = Arrays.asList(nodeE,nodeB);
		List<Node> shortestPathForNodeEB = Arrays.asList(nodeE);
		List<Node> shortestPathForNodeEC = Arrays.asList(nodeE,nodeD,nodeF);
		List<Node> shortestPathForNodeED = Arrays.asList(nodeE);
		List<Node> shortestPathForNodeEF = Arrays.asList(nodeE,nodeD);
		
		for (Node node : graph.getNodes()) {
			switch (node.getCity().getName()) {
			case "A":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeEA));
				break;
			case "B":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeEB));
				break;
			case "C":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeEC));
				break;
			case "D":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeED));
				break;
			case "F":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeEF));
				break;
			}
		}

	}

	
	
	
	@Test
	public void whenDijkstra_HappyPathShortestTime() {

		Node nodeA = new Node(new City("A"));
		Node nodeB = new Node(new City("B"));
		Node nodeC = new Node(new City("C"));
		Node nodeD = new Node(new City("D"));
		Node nodeE = new Node(new City("E"));
		Node nodeF = new Node(new City("F"));

		nodeA.addDestination(nodeB, 10);
		nodeA.addDestination(nodeC, 15);

		nodeB.addDestination(nodeD, 12);
		nodeB.addDestination(nodeF, 15);

		nodeC.addDestination(nodeE, 10);

		nodeD.addDestination(nodeE, 2);
		nodeD.addDestination(nodeF, 1);

		nodeF.addDestination(nodeE, 5);

		Graph graph = new Graph();

		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);
		graph.addNode(nodeE);
		graph.addNode(nodeF);

		graph = Dijkstra.calculateShortestPathFromSource(graph, nodeA);

		List<Node> shortestPathForNodeB = Arrays.asList(nodeA);
		List<Node> shortestPathForNodeC = Arrays.asList(nodeA);
		List<Node> shortestPathForNodeD = Arrays.asList(nodeA, nodeB);
		List<Node> shortestPathForNodeE = Arrays.asList(nodeA, nodeB, nodeD);
		List<Node> shortestPathForNodeF = Arrays.asList(nodeA, nodeB, nodeD);

		for (Node node : graph.getNodes()) {
			switch (node.getCity().getName()) {
			case "B":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeB));
				break;
			case "C":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeC));
				break;
			case "D":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeD));
				break;
			case "E":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeE));
				break;
			case "F":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeF));
				break;
			}
		}
	}

	@Test
	public void whenGraphCycle_Ignore() {

		Node nodeA = new Node(new City("A"));
		Node nodeB = new Node(new City("B"));
		Node nodeC = new Node(new City("C"));
		Node nodeD = new Node(new City("D"));
		Node nodeE = new Node(new City("E"));
		Node nodeF = new Node(new City("F"));

		nodeA.addDestination(nodeB, 10);
		// Graph Cycle
		nodeB.addDestination(nodeA, 10);

		nodeA.addDestination(nodeC, 15);

		nodeB.addDestination(nodeD, 12);
		nodeB.addDestination(nodeF, 15);

		nodeC.addDestination(nodeE, 10);
		// Graph Cycle
		nodeE.addDestination(nodeC, 10);

		nodeD.addDestination(nodeE, 2);
		nodeD.addDestination(nodeF, 1);

		nodeF.addDestination(nodeE, 5);

		Graph graph = new Graph();

		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);
		graph.addNode(nodeE);
		graph.addNode(nodeF);

		graph = Dijkstra.calculateShortestPathFromSource(graph, nodeA);

		List<Node> shortestPathForNodeB = Arrays.asList(nodeA);
		List<Node> shortestPathForNodeC = Arrays.asList(nodeA);
		List<Node> shortestPathForNodeD = Arrays.asList(nodeA, nodeB);
		List<Node> shortestPathForNodeE = Arrays.asList(nodeA, nodeB, nodeD);
		List<Node> shortestPathForNodeF = Arrays.asList(nodeA, nodeB, nodeD);

		for (Node node : graph.getNodes()) {
			switch (node.getCity().getName()) {
			case "B":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeB));
				break;
			case "C":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeC));
				break;
			case "D":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeD));
				break;
			case "E":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeE));
				break;
			case "F":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeF));
				break;
			}
		}
	}

	@Test
	public void whenDijkstra_HappyPathConnections() {

		Node nodeA = new Node(new City("A"));
		Node nodeB = new Node(new City("B"));
		Node nodeC = new Node(new City("C"));
		Node nodeD = new Node(new City("D"));
		Node nodeE = new Node(new City("E"));
		Node nodeF = new Node(new City("F"));

		nodeA.addDestination(nodeB, 1);
		nodeB.addDestination(nodeA, 1);

		nodeA.addDestination(nodeC, 1);

		nodeB.addDestination(nodeD, 1);
		nodeB.addDestination(nodeF, 1);

		nodeC.addDestination(nodeE, 1);

		nodeD.addDestination(nodeE, 1);
		nodeD.addDestination(nodeF, 1);

		nodeF.addDestination(nodeE, 1);

		Graph graph = new Graph();

		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);
		graph.addNode(nodeE);
		graph.addNode(nodeF);

		graph = Dijkstra.calculateShortestPathFromSource(graph, nodeA);

		List<Node> shortestPathForNodeB = Arrays.asList(nodeA);
		List<Node> shortestPathForNodeC = Arrays.asList(nodeA);
		List<Node> shortestPathForNodeD = Arrays.asList(nodeA, nodeB);
		List<Node> shortestPathForNodeE = Arrays.asList(nodeA, nodeC);
		List<Node> shortestPathForNodeF = Arrays.asList(nodeA, nodeB);

		for (Node node : graph.getNodes()) {
			switch (node.getCity().getName()) {
			case "B":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeB));
				break;
			case "C":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeC));
				break;
			case "D":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeD));
				break;
			case "E":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeE));
				break;
			case "F":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeF));
				break;
			}
		}
	}

	@Test
	public void whenDijkstra_ShortestTime_diferent_origin() {

		Node nodeA = new Node(new City("A"));
		Node nodeB = new Node(new City("B"));
		Node nodeC = new Node(new City("C"));
		Node nodeD = new Node(new City("D"));
		Node nodeE = new Node(new City("E"));
		Node nodeF = new Node(new City("F"));

		nodeA.addDestination(nodeB, 10);
		nodeA.addDestination(nodeC, 15);

		nodeB.addDestination(nodeD, 12);
		nodeB.addDestination(nodeF, 15);

		nodeC.addDestination(nodeE, 10);

		nodeD.addDestination(nodeE, 2);
		nodeD.addDestination(nodeF, 1);

		nodeF.addDestination(nodeE, 5);

		Graph graph = new Graph();

		graph.addNode(nodeA);
		graph.addNode(nodeB);
		graph.addNode(nodeC);
		graph.addNode(nodeD);
		graph.addNode(nodeE);
		graph.addNode(nodeF);

		graph = Dijkstra.calculateShortestPathFromSource(graph, nodeA);

		List<Node> shortestPathForNodeB = Arrays.asList(nodeA);
		List<Node> shortestPathForNodeC = Arrays.asList(nodeA);
		List<Node> shortestPathForNodeD = Arrays.asList(nodeA, nodeB);
		List<Node> shortestPathForNodeE = Arrays.asList(nodeA, nodeB, nodeD);
		List<Node> shortestPathForNodeF = Arrays.asList(nodeA, nodeB, nodeD);

		for (Node node : graph.getNodes()) {
			switch (node.getCity().getName()) {
			case "B":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeB));
				break;
			case "C":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeC));
				break;
			case "D":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeD));
				break;
			case "E":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeE));
				break;
			case "F":
				assertTrue(node.getShortestPath().equals(shortestPathForNodeF));
				break;
			}
		}
	}

}