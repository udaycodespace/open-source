# 🎨 EduTrack Frontend Dashboard

A lightweight, responsive dashboard interface for the EduTrack system. 
Built with vanilla **HTML5**, **CSS3**, and **JavaScript** (No frameworks).

## 🚀 Features
- **Live Data Visualization:** Fetches and displays active batches.
- **Create Batches:** Form interface to initialize new course batches.
- **System Status:** Visual indicators for system readiness.
- **Error Handling:** Graceful UI feedback when the backend is offline.

## ⚠️ Backend Integration Notes
For this frontend to function 100% correctly, the Spring Boot backend requires two configurations. 

### 1. Connection (CORS)
* **Status:** Critical
* **Issue:** Browser blocks connection to `localhost:8080`.
* **Fix:** Add `@CrossOrigin(origins = "*")` to `BatchEntryController`.

### 2. ID Serialization (The `[OBJ]` Display)
* **Status:** Visual / Functional limitation
* **Issue:** The backend currently returns IDs as raw MongoDB objects (e.g., `{timestamp: ...}`) instead of Strings.
* **Frontend Tweak:** To prevent the UI from crashing, I implemented a fallback that displays these IDs as `[OBJ]` in the table (e.g., `0x0 [OBJ]`).
* **Fix:** Add `@JsonSerialize(using = ToStringSerializer.class)` to the `id` field in `BatchEntry.java`. Once fixed, the UI will automatically show the correct Hex ID (e.g., `#507F1F`).

## 🛠️ Setup
1.  Navigate to the `frontend/` folder.
2.  Open `index.html` (Recommended: Use VS Code "Live Server").
3.  Ensure Backend is running.

---
*EduTrack Frontend v1.0*