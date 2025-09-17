import { useState } from "react";

export const ToDo = () => {
  const [tasks, setTasks] = useState([]);
  const [newTask, setNewTask] = useState("");

  const addTask = () => {
    if (newTask.trim()) {
      setTasks([...tasks, newTask]);
      setNewTask("");
    }
  };

  const deleteTask = (index) => {
    setTasks(tasks.filter((_, i) => i !== index));
  };

  return (
    <>
      <h1>ToDo App</h1>
      <input
        type="text"
        value={newTask}
        onChange={(e) => setNewTask(e.target.value)}
        placeholder="Enter task"
        style={{ marginRight: "8px", padding: "4px", width: "200px", borderRadius: "4px", border: "1px solid #ccc" , height: "30px", fontSize: "16px"}}
      />
      <button onClick={addTask}>Add✅</button>

      <ol>
        {tasks.map((task, index) => (
          <li key={index}>
            {task} <button onClick={() => deleteTask(index)}>Delete❌</button>
          </li>
        ))}
      </ol>
    </>
  );
};
